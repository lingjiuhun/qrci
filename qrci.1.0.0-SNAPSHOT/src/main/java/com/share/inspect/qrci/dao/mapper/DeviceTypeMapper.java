package com.share.inspect.qrci.dao.mapper;

import com.share.inspect.qrci.enter.DeviceType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Description: mapper接口
 * @date: 2018-8-28 21:37:19
 */
@Component
@Mapper
public interface DeviceTypeMapper {


    /**
     * 根据主键查询
     *
     * @param id
     * @Author:
     * @return: com.share.inspect.qrci.enter.DeviceType
     * @exception:
     * @date: 2018-8-28 21:37:19
     */
    DeviceType selectByPrimaryKey(Long id);

    /**
     * 根据主键删除
     *
     * @param id
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:37:19
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据主键批量删除
     *
     * @param list
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:37:19
     */
    int deleteBatchByPrimaryKey(List
                                        <String> list);


    /**
     * 新增
     *
     * @param record
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:37:19
     */
    int insertSelective(DeviceType record);

    /**
     * 根据属性分页查询
     *
     * @param map
     * @Author:
     * @return: java.util.List<com.share.inspect.qrci.enter.DeviceType>
     * @exception:
     * @date: 2018-8-28 21:37:19
     */
    List<DeviceType> selectByPropertyByPage(Map map);

    /**
     * 根据属性查询记录数
     *
     * @param map
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:37:19
     */
    int selectCountByProperty(Map map);

    /**
     * 根据主键更新记录
     *
     * @param record
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:37:19
     */
    int updateByPrimaryKeySelective(DeviceType record);

}