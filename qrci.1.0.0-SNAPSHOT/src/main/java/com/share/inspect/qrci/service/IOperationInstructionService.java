package com.share.inspect.qrci.service;

import com.github.pagehelper.PageInfo;
import com.share.inspect.qrci.enter.OperationInstruction;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Description: 服务接口
 * @date: 2018-8-28 21:56:31
 */
public interface IOperationInstructionService {

    /**
     * 根据参数分页查询
     *
     * @param param
     * @param page
     * @param pageSize
     * @Author:
     * @return: com.github.pagehelper.PageInfo<com.share.inspect.qrci.enter.OperationInstruction>
     * @exception:
     * @date: 2018-8-28 21:56:31
     */
    PageInfo<OperationInstruction> selectByPage(Map
                                                        <String, Object> param, Integer page, Integer pageSize) throws Exception;


    /**
     * 新增
     *
     * @param operationInstruction
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 21:56:31
     */
    Integer insert(OperationInstruction operationInstruction) throws Exception;


    /**
     * 根据主键更新
     *
     * @param operationInstruction
     * @Author:
     * @return: java.lang.Integer
     * @exception:
     * @date: 2018-8-28 21:56:31
     */
    Integer updateById(OperationInstruction operationInstruction) throws Exception;

    /**
     * 根据主键删除
     *
     * @param id
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:56:31
     */
    int deleteById(Long id) throws Exception;

    /**
     * 根据主键批量删除
     *
     * @param ids
     * @Author:
     * @return: int
     * @exception:
     * @date: 2018-8-28 21:56:31
     */
    Integer deleteBatchByIds(List ids) throws Exception;


    /**
     * 根据主键查询
     *
     * @param id
     * @Author:
     * @return: com.share.inspect.qrci.enter.OperationInstruction
     * @exception:
     * @date: 2018-8-28 21:56:31
     */
    OperationInstruction selectById(Long id) throws Exception;


}