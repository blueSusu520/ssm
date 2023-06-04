package ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.mapper.CostMapper;
import ssm.pojo.Cost;
import ssm.service.CostService;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class CostServiceImpl implements CostService {

    @Autowired
    private CostMapper costMapper;

    //查询消费列表
    @Override
    public List<Cost> getCostList() {
        return costMapper.getCostList();
    }

    //获取消费的分页信息
    @Override
    public PageInfo<Cost> getCostPage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,4);
        //查询所有的员工信息
        List<Cost> list = costMapper.getCostList();
        //获取分页相关数据
        PageInfo<Cost> page=new PageInfo<>(list,5);
        return page;
    }

    //添加消费信息
    @Override
    public void addCost(Cost cost) {
        costMapper.addCost(cost);
    }

    //根据id查询消费信息
    @Override
    public Cost getCostById(Integer id) {
        return costMapper.getCostById(id);
    }

    //修改消费信息
    @Override
    public void editCost(Cost cost) {
        costMapper.editCost(cost);
    }

    //删除消费信息
    @Override
    public void removeCostById(Integer id) {
        costMapper.removeCostById(id);
    }


}
