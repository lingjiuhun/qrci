package com.share.inspect.qrci.controller;


import com.code.base.util.utils.RestResponse;
import com.github.pagehelper.PageInfo;
import com.share.inspect.qrci.enter.UnitInfo;
import com.share.inspect.qrci.service.impl.UnitInfoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:
 * @Description: 管理
 * @date: 2018-8-28 22:22:17
 */
@Log4j2
@RestController
@RequestMapping("/api/v1/unitInfos")
@Api(description = "部门API", tags = "部门API")
public class UnitInfoController {
    @Autowired
    private UnitInfoServiceImpl unitInfoServiceImpl;

    /**
     * 分页查询
     *
     * @param page
     * @param pageSize
     * @Author:
     * @return: com.code.base.util.utils.RestResponse
     * <com.github.pagehelper.PageInfo>
     * @exception:
     * @date: 2018-8-28 22:22:17
     */
    @ApiOperation(value = "获取..列表", notes = "获取..列表")
    @RequestMapping(value = "", method = RequestMethod.GET)
    public RestResponse
            <PageInfo> getList(
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "pageSize", required = false) Integer pageSize) {
        PageInfo<UnitInfo> pageInfo = null;
        try {
            pageInfo = unitInfoServiceImpl.selectByPage(null, page == null ? 1 : page, pageSize == null ?
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
     * @param unitInfo
     * @Author:
     * @return: com.code.base.util.utils.RestResponse
     * @exception:
     * @date: 2018-8-28 22:22:17
     */
    @ApiOperation(value = "新增..", notes = "新增..")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public RestResponse doAdd(@RequestBody UnitInfo unitInfo) {
        RestResponse result = new RestResponse();
        try {
            Integer r = unitInfoServiceImpl.insert(unitInfo);
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
     * @param id
     * @Author:
     * @return: com.code.base.util.utils.RestResponse
     * @exception:
     * @date: 2018-8-28 22:22:17
     */
    @ApiOperation(value = "删除权限", notes = "删除权限")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public RestResponse doDelete(@PathVariable Long id) {
        RestResponse result = new RestResponse();
        try {
            Integer r = unitInfoServiceImpl.deleteById(id);
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
     * @param id
     * @Author:
     * @return: com.code.base.util.utils.RestResponse<com.share.inspect.qrci.enter.UnitInfo>
     * @exception:
     * @date: 2018-8-28 22:22:17
     */
    @ApiOperation(value = "根据id获取权限信息", notes = "根据id获取权限信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RestResponse<UnitInfo> doGetDetail(@PathVariable Long id) {
        RestResponse result = new RestResponse();
        try {
            UnitInfo unitInfo = unitInfoServiceImpl.selectById(id);
            result.setSuccess(true).setMessage("success").setData(unitInfo);
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
     * @param id
     * @param unitInfo
     * @Author:
     * @return: com.hollysys.haier.robot.bean.RestResponse
     * @exception:
     * @date: 2018-8-28 22:22:17
     */
    @ApiOperation(value = "编辑权限", notes = "编辑权限")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public RestResponse doUpdate(@PathVariable Long id,
                                 @RequestBody UnitInfo unitInfo) {
        RestResponse result = new RestResponse();
        try {
            Integer r = unitInfoServiceImpl.updateById(unitInfo);
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