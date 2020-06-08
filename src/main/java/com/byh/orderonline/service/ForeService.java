package com.byh.orderonline.service;

import com.byh.orderonline.pojo.Category;
import com.byh.orderonline.pojo.Product;

import java.util.List;

public interface ForeService {

    /**
     * 返回保存6个分类对象的List集合
     * @return
     */
    public List<Category> listToThree();

    public List<Product> getFivePro();

}
