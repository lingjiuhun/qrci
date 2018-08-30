package com.share.inspect.qrci.controller;


import com.code.base.util.utils.RestResponse;
import com.github.pagehelper.PageInfo;
import com.share.inspect.qrci.enter.User;
import com.share.inspect.qrci.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

/**
* @Author:
* @Description: 管理
* @date: 2018-8-30 18:54:44
*/
@Log4j2
@RestController
@RequestMapping("/api/v1/users")
@Api(description = "API", tags = "API")
public class UserController{
@Autowired
private UserServiceImpl userServiceImpl;

    /**
     * 分页查询
     *
     * @param page
     * @param pageSize
     * @Author:
     * @return: com.code.base.util.utils.RestResponse
    <com.github.pagehelper.PageInfo>
     * @exception:
     * @date: 2018-8-29 20:37:15
     */
    @ApiOperation(value = "获取..列表", notes = "获取..列表")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public RestResponse
            <PageInfo> getList(
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        PageInfo<User> pageInfo = null;
        try {
            pageInfo = userServiceImpl.selectByPage(null, page == null ? 1 : page, pageSize == null ?
                    Integer.MAX_VALUE : pageSize);
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error(ex.getMessage());
        }

        return new RestResponse().setSuccess(true).setMessage("操作成功").setData(pageInfo);
    }


    /**
     * 新增
     *
     * @param user
     * @Author:
     * @return: com.code.base.util.utils.RestResponse
     * @exception:
     * @date: 2018-8-29 20:37:15
     */
    @ApiOperation(value = "新增..", notes = "新增..")
    @RequestMapping(value = "/", method = RequestMethod.POST, produces="application/json;charset=UTF-8")
    public RestResponse doAdd(@RequestBody User user) {
        RestResponse result = new RestResponse();
        try {
            user.setUserId(UUID.randomUUID().toString().replace("-",""));
            user.setUpdateTime(new Date().getTime()/1000);
            Integer r = userServiceImpl.insert(user);
            if (r > 0) {
                result.setSuccess(true).setMessage("操作成功");
            } else {
                result.setSuccess(false).setMessage("操作失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            result.setSuccess(false).setMessage("操作失败");
        }
        return result;
    }


    /**
     * 根据主键删除
     *
     * @param userIds
     * @Author:
     * @return: com.code.base.util.utils.RestResponse
     * @exception:
     * @date: 2018-8-29 20:37:15
     */
    @ApiOperation(value = "删除权限", notes = "删除权限")
    @RequestMapping(value = "/{userIds}", method = RequestMethod.DELETE)
    public RestResponse doDelete(@PathVariable String userIds) {
        RestResponse result = new RestResponse();
        try {
            Integer r = userServiceImpl.deleteById(userIds);
            if (r > 0) {
                result.setSuccess(true).setMessage("操作成功");
            } else {
                result.setSuccess(false).setMessage("操作失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            result.setSuccess(false).setMessage("操作失败");
        }

        return result;
    }


    /**
     * 根据主键获取详情
     *
     * @param userId
     * @Author:
     * @return: com.code.base.util.utils.RestResponse<com.share.inspect.qrci.enter.User>
     * @exception:
     * @date: 2018-8-29 20:37:15
     */
    @ApiOperation(value = "根据id获取权限信息", notes = "根据id获取权限信息")
    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public RestResponse<User> doGetDetail(@PathVariable String userId) {
        RestResponse result = new RestResponse();
        try {
            User user = userServiceImpl.selectById(userId);
            result.setSuccess(true).setMessage("操作成功").setData(user);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            result.setSuccess(false).setMessage("操作失败");
        }

        return result;
    }


    /**
     * 根据主键更新
     *
     * @param userId
     * @param user
     * @Author:
     * @return: com.hollysys.haier.robot.bean.RestResponse
     * @exception:
     * @date: 2018-8-29 20:37:15
     */
    @ApiOperation(value = "编辑权限", notes = "编辑权限")
    @RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
    public RestResponse doUpdate(@PathVariable String userId,
                                 @RequestBody User user) {
        RestResponse result = new RestResponse();
        try {
            user.setUpdateTime(new Date().getTime()/1000);
            Integer r = userServiceImpl.updateById(user);
            if (r > 0) {
                result.setSuccess(true).setMessage("操作成功");
            } else {
                result.setSuccess(false).setMessage("操作失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            result.setSuccess(false).setMessage("操作失败");
        }

        return result;
    }


        }