package com.share.inspect.qrci.service;

import com.github.pagehelper.PageInfo;
import com.share.inspect.qrci.enter.DeviceTypeProperty;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Description: 服务接口
 * @date: 2018-8-28 21:45:44
 */
public interface IDeviceTypePropertyService {

    /**
     * 根据参数分页查询
     *
     * @param param
     * @param page
     * @param pageSize
     * @Author:
     * @return: com.github.pagehelper.PageInfo<com.share.inspect.qrci.enter.DeviceTypeProperty>
     * @exception:
     * @date: 2018-8-28 21:45:44
     */
    PageInfo<DeviceTypeProperty> selectByPage(Map
                                                      <String, Object> param, Integer page, Integer pageSize) throws Exception;


    /**
     * 新增
     *
     * @param deviceTypeProperty
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 21:45:44
     */
    Integer insert(DeviceTypeProperty deviceTypeProperty) throws Exception;


    /**
     * 根据主键更新
     *
     * @param deviceTypeProperty
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 21:45:44
     */
    Integer updateById(DeviceTypeProperty deviceTypeProperty) throws Exception;

    /**
     * 根据主键删除
     *
     * @param id
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:45:44
     */
    int deleteById(Long id) throws Exception;

    /**
     * 根据主键批量删除
     *
     * @param ids
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:45:44
     */
    Integer deleteBatchByIds(List ids) throws Exception;


    /**
     * 根据主键查询
     *
     * @param id
     * @Author:
     * @return: com.share.inspect.qrci.enter.DeviceTypeProperty
     * @exception:
     * @date: 2018-8-28 21:45:44
     */
    DeviceTypeProperty selectById(Long id) throws Exception;


}