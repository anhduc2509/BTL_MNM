package com.hoa.shopbanhang.adapter.web.v1.transfer.response;

import com.hoa.shopbanhang.domain.entities.Cart;
import com.hoa.shopbanhang.domain.entities.ItemDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDetailOutput {

  private Cart cart;

  private List<ItemDetail> itemDetails;

}
