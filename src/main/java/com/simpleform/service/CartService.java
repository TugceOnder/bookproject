package com.simpleform.service;

import com.simpleform.model.Cart;
import com.simpleform.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public void addItemToCart(String username, Long bookId, int quantity) {
        // Sepete öğe ekleme işlemini burada gerçekleştir
    }

    public String getCart(String username) {
        return username;
    }

    public Cart getCartForUser(String username) {
        return cartRepository.findByUsername(username);
    }
}
