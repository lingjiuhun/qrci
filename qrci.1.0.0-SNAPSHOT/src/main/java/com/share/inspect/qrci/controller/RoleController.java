package com.share.inspect.qrci.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.code.base.util.utils.RestResponse;
import com.github.pagehelper.PageInfo;


import com.share.inspect.qrci.enter.Role;
import com.share.inspect.qrci.service.impl.RoleServiceImpl;

/**
* @Author:
* @Description: 管理
* @date: 2018-8-29 20:54:26
*/
@Log4j2
@RestController
@RequestMapping("/api/v1/roles")
@Api(description = "角色管理API", tags = "角色管理API")
public class RoleController{
@Autowired
private RoleServiceImpl roleServiceImpl;

/**
* 分页查询
*
* @param page
* @param pageSize
* @Author:
* @return: com.code.base.util.utils.RestResponse
<com.github.pagehelper.PageInfo>
    * @exception:
    * @date: 2018-8-29 20:54:26
    */
    @ApiOperation(value = "获取..列表", notes = "获取..列表")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public RestResponse
    <PageInfo> getList(
        @RequestParam(value = "page", required = false) Integer page,
        @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        PageInfo<Role> pageInfo = null;
        try {
        pageInfo = roleServiceImpl.selectByPage(null, page == null ? 1 : page, pageSize == null ?
        Integer.MAX_VALUE : pageSize);
        } catch (Exception ex) {
        ex.printStackTrace();
        log.error(ex.getMessage());
        }

        return new RestResponse().setSuccess(true).setMessage("success").setData(pageInfo);
        }


        /**
        * 新增
        *
        * @param role
        * @Author:
        * @return: com.code.base.util.utils.RestResponse
        * @exception:
        * @date: 2018-8-29 20:54:26
        */
        @ApiOperation(value = "新增..", notes = "新增..")
        @RequestMapping(value = "/", method = RequestMethod.POST)
        public RestResponse doAdd(@RequestBody Role role) {
        RestResponse result = new RestResponse();
        try {
        Integer r = roleServiceImpl.insert(role);
        if (r > 0) {
        result.setSuccess(true).setMessage("success");
        } else {
        result.setSuccess(false).setMessage("fail");
        }
        } catch (Exception e) {
        e.printStackTrace();
        log.error(e.getMessage());
        result.setSuccess(false).setMessage("fail");
        }
        return result;
        }


        /**
        * 根据主键删除
        *
        * @param roleId
        * @Author:
        * @return: com.code.base.util.utils.RestResponse
        * @exception:
        * @date: 2018-8-29 20:54:26
        */
        @ApiOperation(value = "删除权限", notes = "删除权限")
        @RequestMapping(value = "/{roleId}", method = RequestMethod.DELETE)
        public RestResponse doDelete(@PathVariable Long roleId) {
        RestResponse result = new RestResponse();
        try {
        Integer r = roleServiceImpl.deleteById(roleId);
        if (r > 0) {
        result.setSuccess(true).setMessage("success");
        } else {
        result.setSuccess(false).setMessage("fail");
        }
        } catch (Exception e) {
        e.printStackTrace();
        log.error(e.getMessage());
        result.setSuccess(false).setMessage("fail");
        }

        return result;
        }


        /**
        * 根据主键获取详情
        *
        * @param roleId
        * @Author:
        * @return: com.code.base.util.utils.RestResponse<com.share.inspect.qrci.enter.Role>
        * @exception:
        * @date: 2018-8-29 20:54:26
        */
        @ApiOperation(value = "根据id获取权限信息", notes = "根据id获取权限信息")
        @RequestMapping(value = "/{roleId}", method = RequestMethod.GET)
        public RestResponse<Role> doGetDetail(@PathVariable Long roleId) {
        RestResponse result = new RestResponse();
        try {
    Role role = roleServiceImpl.selectById(roleId);
        result.setSuccess(true).setMessage("success").setData(role);
        } catch (Exception e) {
        e.printStackTrace();
        log.error(e.getMessage());
        result.setSuccess(false).setMessage("fail");
        }

        return result;
        }


        /**
        * 根据主键更新
        *
        * @param roleId
        * @param role
        * @Author:
        * @return: com.hollysys.haier.robot.bean.RestResponse
        * @exception:
        * @date: 2018-8-29 20:54:26
        */
        @ApiOperation(value = "编辑权限", notes = "编辑权限")
        @RequestMapping(value = "/{roleId}", method = RequestMethod.PUT)
        public RestResponse doUpdate(@PathVariable Long roleId,
        @RequestBody Role role) {
        RestResponse result = new RestResponse();
        try {
        Integer r = roleServiceImpl.updateById(role);
        if (r > 0) {
        result.setSuccess(true).setMessage("success");
        } else {
        result.setSuccess(false).setMessage("fail");
        }
        } catch (Exception e) {
        e.printStackTrace();
        log.error(e.getMessage());
        result.setSuccess(false).setMessage("fail");
        }

        return result;
        }


        }