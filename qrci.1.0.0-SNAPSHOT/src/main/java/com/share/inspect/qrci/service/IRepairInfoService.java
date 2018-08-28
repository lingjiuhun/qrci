package com.share.inspect.qrci.service;

import com.github.pagehelper.PageInfo;
import com.share.inspect.qrci.enter.RepairInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Description: 服务接口
 * @date: 2018-8-28 22:14:26
 */
public interface IRepairInfoService {

    /**
     * 根据参数分页查询
     *
     * @param param
     * @param page
     * @param pageSize
     * @Author:
     * @return: com.github.pagehelper.PageInfo<com.share.inspect.qrci.enter.RepairInfo>
     * @exception:
     * @date: 2018-8-28 22:14:26
     */
    PageInfo<RepairInfo> selectByPage(Map
                                              <String, Object> param, Integer page, Integer pageSize) throws Exception;


    /**
     * 新增
     *
     * @param repairInfo
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 22:14:26
     */
    Integer insert(RepairInfo repairInfo) throws Exception;


    /**
     * 根据主键更新
     *
     * @param repairInfo
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 22:14:26
     */
    Integer updateById(RepairInfo repairInfo) throws Exception;

    /**
     * 根据主键删除
     *
     * @param id
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 22:14:26
     */
    int deleteById(Long id) throws Exception;

    /**
     * 根据主键批量删除
     *
     * @param ids
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 22:14:26
     */
    Integer deleteBatchByIds(List ids) throws Exception;


    /**
     * 根据主键查询
     *
     * @param id
     * @Author:
     * @return: com.share.inspect.qrci.enter.RepairInfo
     * @exception:
     * @date: 2018-8-28 22:14:26
     */
    RepairInfo selectById(Long id) throws Exception;


}