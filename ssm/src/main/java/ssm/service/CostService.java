package ssm.service;

import com.github.pagehelper.PageInfo;
import ssm.pojo.Cost;

import java.util.Date;
import java.util.List;

public interface CostService {

    //查询消费列表
    List<Cost> getCostList();

    //获取消费的分页信息
    PageInfo<Cost> getCostPage(Integer pageNum);

    //添加消费信息
    void addCost(Cost cost);

    //根据id查询消费信息
    Cost getCostById(Integer id);

    //修改消费信息
    void editCost(Cost cost);

    //删除消费信息
    void removeCostById(Integer id);



}
