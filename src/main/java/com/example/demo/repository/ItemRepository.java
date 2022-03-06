//package com.example.demo.repository;
//
//import com.example.demo.entity.Item;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.querydsl.QuerydslPredicateExecutor;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface ItemRepository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item>{
//    List<Item> findByItemNm(String itemNm); //상품이름으로 조회
//    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail); //이름 또는 설명으로 조회
//    List<Item> findByPriceLessThan(Integer price); //설정값보다 낮은 가격으로 조회
//    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price); //설정값보다 낮으며 높은 가격 순으로 조회
//
//    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
//    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail); //DB에 독자적
//
//    @Query(value = "select i from Item i where i.item_detail like %:itemDetail% order by i.price desc", nativeQuery=true)
//    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail); //DB에 종속적
//
//
//}
