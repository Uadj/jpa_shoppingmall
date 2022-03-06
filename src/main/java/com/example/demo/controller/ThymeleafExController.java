package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafExController {
    @GetMapping(value = "hello")
    public void hello(Model model){
        model.addAttribute("message", "SnowDear");
    }
    @GetMapping(value="/ex02")
    public String thymeleafExample02(Model model){
        ItemDto itemDto = new ItemDto();
        itemDto.setItemDetail("상품 상세설명");
        itemDto.setItemNm("상품1");
        itemDto.setPrice(1000);
        itemDto.setRegTime(LocalDateTime.now());
        model.addAttribute("itemDto", itemDto);
        return "thymeleafEx02";
    }
    @GetMapping(value="/ex03")
    public String thymeleafExample03(Model model){
        List<ItemDto> itemDtoList = new ArrayList<>();
        for(int i=0; i<=10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세설명"+i);
            itemDto.setItemNm("상품1"+i);
            itemDto.setPrice(1000*i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx03";
    }
    @GetMapping(value="/ex04")
    public String thymeleafExample04(Model model){
        List<ItemDto> itemDtoList = new ArrayList<>();
        for(int i=0; i<=10; i++) {
            ItemDto itemDto = new ItemDto();
            itemDto.setItemDetail("상품 상세설명"+i);
            itemDto.setItemNm("상품1"+i);
            itemDto.setPrice(1000*i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList", itemDtoList);
        return "thymeleafEx04";
    }
    @GetMapping(value = "/ex05")
    public String thymeleafExample05(Model model){
        return "thymeleafEx05";
    }
    @GetMapping(value = "/ex06")
    public String thymeleafExample06(String param1, String param2, Model model){
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        return "thymeleafEx06";
    }
    @GetMapping(value = "/ex07")
    public String thymeleafExample07(Model model){
        return "thymeleafEx07";
    }

}
