package com.examples.security;

import lombok.Data;

/**
 * Created by huangshitao on 15/10/12.
 */
@Data
public class Principal {
    private Long id;

    public Principal(Long id) {
        this.id = id;
    }
}
