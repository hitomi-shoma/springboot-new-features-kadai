//package com.example.samuraitravel.repository;
//
//import java.util.List;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.example.samuraitravel.entity.House;
//import com.example.samuraitravel.entity.Review;
//import com.example.samuraitravel.entity.User;
//
//public interface ReviewRepository extends JpaRepository<Review,Integer>{
//	public List<Review> findByHouseOrderByCreatedAtDesc(House house);//Reviewを作成日時の降順で取得する
//	public Page<Review> findByHouseOrderByCreatedAtDesc(House house,Pageable pageable);//Reviewを作成日時の降順でページングする
//	public Review findByHouseAndUser(House house);//民宿のReviewを取得する。
//	public Review findByHouseAndUser(User user);//ユーザーのReviewを取得する。
//	public Review findByHouseAndUser(House house,User user);
//	public Long countByHouse(House house);//houseエンティティの数を取得	
//}


package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.entity.Review;
import com.example.samuraitravel.entity.User;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

	public Page<Review> findByHouseOrderByUpdatedAtDesc(House house, Pageable pageable);

	public List<Review> findTop6ByHouseOrderByUpdatedAtDesc(House house);

	public Review getByUserAndHouse(User use, House house);
}
