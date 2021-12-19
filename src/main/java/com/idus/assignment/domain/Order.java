package com.idus.assignment.domain;

import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Order {
    @Id
    @Column(length = 12, nullable = false)
    @ApiModelProperty(value="주문번호", required = true)
    String order_id;

    @Column(length = 100, nullable = false)
    @ApiModelProperty(value="제품명", required = true)
    String product_name;

    @Column(length = 20, nullable = false)
    @ApiModelProperty(value="결제일시", required = true)
    LocalDateTime payment_date;

}