package com.hubofAkhila.NumberToWords;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumtoWordsMainAppTest {

	@Test
	void test() {
		NumtoWordsMainApp app = new NumtoWordsMainApp();
		Assertions.assertEquals("FiftySixmillion Ninehundred FortyFivethousand Sevenhundred EightyOne",
				app.numberToWordsChcek(56945781));
	}

}
