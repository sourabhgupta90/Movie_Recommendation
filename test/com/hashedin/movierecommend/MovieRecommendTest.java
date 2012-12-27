package com.hashedin.movierecommend;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hashedin.movieRecommendation.MovieBuff;
import com.hashedin.movieRecommendation.MovieManager;
import com.hashedin.parser.HardCodedData;

public class MovieRecommendTest {

	@Test
	public void test() {
		
		MovieManager movieManagerObj = new HardCodedData();
		
		MovieBuff movieBuffObj  = new MovieBuff(movieManagerObj);
		
		assertEquals(2, movieBuffObj.mostWatchedUserId());
		
		//fail("Not yet implemented");
	}

}
