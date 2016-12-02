package com.Shoestore.service;

import com.Shoestore.model.Cart;

public interface CartService {

    Cart getCartById(int cartId);

    void update(Cart cart);
}
