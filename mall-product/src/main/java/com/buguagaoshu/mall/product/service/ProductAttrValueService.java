package com.buguagaoshu.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buguagaoshu.common.utils.PageUtils;
import com.buguagaoshu.mall.product.entity.ProductAttrValueEntity;
import com.buguagaoshu.mall.product.vo.BaseAttrs;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author Pu Zhiwei
 * @email puzhiweipuzhiwei@foxmail.com
 * @date 2020-04-06 13:07:09
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 保存产品属性值
     * @param spuInfoId Id
     * @param baseAttrs 页面提交的基本属性值
     * */
    void saveBaseProductAttrValue(Long spuInfoId, List<BaseAttrs> baseAttrs);
}

