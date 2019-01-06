package com.ingecno.MysteryShoppers.test.client;

import org.unitils.reflectionassert.ReflectionAssert;
import org.unitils.reflectionassert.ReflectionComparatorMode;

public class usertest {
public static void main(String[] args) {
	User user1 = new User(1, "John", "Doe");
	User user2 = new User(1, "John", "Doe");
	ReflectionAssert.assertReflectionEquals(user2, user1, ReflectionComparatorMode.IGNORE_DEFAULTS);
}
}
