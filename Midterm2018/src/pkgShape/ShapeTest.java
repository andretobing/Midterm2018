package pkgShape;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {

	@Test
	void CuboidTest() {
		Cuboid cube = new Cuboid(2, 2, 2);

		assertEquals(cube.getiLength(), 2);
		assertEquals(cube.getiWidth(), 2);
		assertEquals(cube.getiDepth(), 2);

		cube.setiWidth(4);
		cube.setiLength(4);
		cube.setiDepth(4);

		assertEquals(cube.area(), 96);

		Assertions.assertThrows(UnsupportedOperationException.class, () -> cube.perimeter());

		assertEquals(cube.volume(), 64);

		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
		cubes.add(new Cuboid(1,1,1));
		cubes.add(new Cuboid(2,2,2));

		Collections.sort(cubes, new SortByArea());

		cubes.set(0, new Cuboid(2, 2, 2));
		cubes.set(1, new Cuboid(1, 1, 1));

		Collections.sort(cubes, new SortByVolume());
	}
	
	@Test
	
	void RecTest() {
		Rectangle myrectangle = new Rectangle(3, 2);
	
		assertEquals(myrectangle.getiLength(), 2);
		assertEquals(myrectangle.getiWidth(), 3);
		
		myrectangle.setiWidth(2);
		myrectangle.setiLength(3);
	
		assertEquals(myrectangle.area(), 6);
		
		assertEquals(myrectangle.perimeter(), 10);

		Rectangle[] myrectangles = { new Rectangle(2, 2), new Rectangle(4, 6) };

		Arrays.sort(myrectangles);

	}

}
