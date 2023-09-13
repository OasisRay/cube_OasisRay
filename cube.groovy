
return new Cube(	45,// X dimention
			70,// Y dimention
			90//  Z dimention
			).toCSG()// this converts from the geometry to an object we can work with
			
new ChamferedCube(
	500,// X 
	50, // Y
	25, // Z
	5 // Chamfer length
	).toCSG()

	//create a rounded cube
CSG roundedCube = new RoundedCube(	40,// X dimention
				40,// Y dimention
				40//  Z dimention
				)
				.cornerRadius(4)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
	

