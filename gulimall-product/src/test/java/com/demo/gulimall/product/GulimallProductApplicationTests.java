package com.demo.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.gulimall.product.entity.BrandEntity;
import com.demo.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为");
        
        
//        brandEntity.setDescript("huawei");
//        brandService.save(brandEntity);
//        System.out.println("保存成功...");
        
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        list.forEach((item)->{
            System.out.println(item);
        });


    }

}
