package com.decent.springboot.sell.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author jiangyu
 * @date 2019/6/11 21:29
 * @email jiangyu9633@foxmail.com
 */
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    /*库存*/
    private Integer productStock;
    /*描述*/
    private String productDescription;
    /*小图*/
    private String productIcon;
    /*类目状态*/
    private Integer productStatus;
    /*类目编号*/
    private Integer categoryType;


}