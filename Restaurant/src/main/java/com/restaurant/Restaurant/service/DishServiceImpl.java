package com.restaurant.Restaurant.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.Restaurant.Model.DishDto;
import com.restaurant.Restaurant.dao.Dishes;
import com.restaurant.Restaurant.dao.Restaurant;
import com.restaurant.Restaurant.repository.DishRepository;
import com.restaurant.Restaurant.repository.RestaurantRepository;

@Service
public class DishServiceImpl implements DishService {

	@Autowired
	DishRepository dishRepository;

	@Autowired
	RestaurantRepository restRepository;


	@Override
	public void addDish(DishDto dishDto) throws Exception {
		Dishes dish = new Dishes();
		/**
		 * For bean utils to work the field names should be exact same. Values from
		 * dishDto will be copied to dish.
		 */
		BeanUtils.copyProperties(dishDto, dish);
		/**
		 * Get the Restaurant object .
		 */
		Integer restaurantId = dishDto.getRestaurant();
		Optional<Restaurant> resOptional = restRepository.findById(restaurantId);
		Restaurant restaurant = null;
		if (resOptional.isPresent()) {
			restaurant = resOptional.get();
		} else {
			throw new Exception("NO SUCH RESTAURANT");
		}
		dish.setRestaurant(restaurant);
		dishRepository.save(dish);

	}

}
