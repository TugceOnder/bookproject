package com.simpleform.controller;

import com.simpleform.model.Cart;
import com.simpleform.service.CartService;
import com.simpleform.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @Autowired
    private PaymentService paymentService;


    @GetMapping("/api/cart")
    public ResponseEntity<Cart> viewCart(@RequestHeader("Authorization") String jwtToken) {
        String username = extractUsernameFromToken(jwtToken);
        Cart cart = cartService.getCartForUser(username);
        return ResponseEntity.ok(cart);
    }

    @PostMapping("/api/payment")
    public ResponseEntity<String> processPayment(@RequestHeader("Authorization") String jwtToken) {
        String username = extractUsernameFromToken(jwtToken);
        String result = paymentService.processPayment(username);
        return ResponseEntity.ok(result);
    }

    private String extractUsernameFromToken(String jwtToken) {
        return jwtToken;
    }
}
