package edu.nju.sa2022.micropos.dtos;

import lombok.Data;

import java.util.Map;

@Data
public class OrderDto {

    private String id;
    private String userId;
    private Map<String, Integer> items;
    private Double total;

}
