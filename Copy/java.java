List<ResFood> ff = new ArrayList<>(resFoods);
FoodAdapter foodAdapter = new FoodAdapter(getContext(), R.layout.food_list_item, ff);
foodList.setAdapter(foodAdapter);