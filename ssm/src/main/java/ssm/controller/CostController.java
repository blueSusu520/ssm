package ssm.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ssm.pojo.Cost;
import ssm.service.CostService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CostController {

    @Autowired
    private CostService costService;

    //解决前段传过来时间的字符串解析成时间报错问题
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }

    //消费列表分页信息
    @RequestMapping(value = "/cost/page/{pageNum}",method = RequestMethod.GET)
    public String getCostPage(@PathVariable("pageNum") Integer pageNum, Model model){
        //获取消费列表的分页信息
        PageInfo<Cost> page=costService.getCostPage(pageNum);
        //将分页数据共享到请求域中
        model.addAttribute("page",page);
        //跳转到cost_list.html
        return "cost_list";
    }

    //消费列表信息
    @RequestMapping(value = "/cost",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //查询所有消费信息
        List<Cost> list=costService.getCostList();
        //将消费信息在请求域中共享
        model.addAttribute("list",list);
        //跳转到cost_list.html
        return "cost_list";
    }

    //跳转添加页面
    @RequestMapping(value = "/to/addCost",method = RequestMethod.GET)
    public String ToAdd(){
        //跳转到cost_add.html
        return "cost_add";
    }

    //添加消费信息
    @RequestMapping(value = "/cost/page/1",method = RequestMethod.POST)
    public String addCost(Cost cost){
        //添加消费信息
        costService.addCost(cost);
        //重定向到列表功能： /cost/page/1
        return "redirect:/cost/page/1";
    }

    //跳转到更新页面
    @RequestMapping(value = "/cost/{id}",method = RequestMethod.GET)
    public String ToUpdate(@PathVariable("id") Integer id,Model model){
        //根据id查询消费信息
        Cost cost=costService.getCostById(id);
        //将消费信息共享到请求域
        model.addAttribute("cost",cost);
        //跳转到cost_update.html
        return "cost_update";
    }

    //更新消费信息
    @RequestMapping(value = "/cost/page/1",method = RequestMethod.PUT)
    public String UpdateCost(Cost cost){
        //修改消费信息
        costService.editCost(cost);
        //重定向到列表功能： /cost/page/1
        return "redirect:/cost/page/1";
    }

    //删除消费信息
    @RequestMapping(value = "/cost/{id}",method = RequestMethod.DELETE)
    public String DeleteCost(@PathVariable("id") Integer id){
        //删除消费信息
        costService.removeCostById(id);
        //重定向到列表功能： /cost/page/1
        return "redirect:/cost/page/1";
    }


}
