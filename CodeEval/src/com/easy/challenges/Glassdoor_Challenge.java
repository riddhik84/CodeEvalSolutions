/*
 * 1 | CodeEval 1355 Market St, SF (37.7768016, -122.4169151)
2 | Yelp 706 Mission St, SF (37.7860105, -122.4025377)
3 | Square 110 5th St, SF (37.7821494, -122.4058960)
4 | Airbnb 99 Rhode Island St, SF (37.7689269, -122.4029053)
5 | Dropbox 185 Berry St, SF (37.7768800, -122.3911496)
6 | Zynga 699 8th St, SF (37.7706628, -122.4040139)
 */

/*
 * 
 * dlon = lon2 - lon1 
dlat = lat2 - lat1 
a = (sin(dlat/2))^2 + cos(lat1) * cos(lat2) * (sin(dlon/2))^2 
c = 2 * atan2( sqrt(a), sqrt(1-a) ) 
d = R * c (where R is the radius of the Earth)
 */

package com.easy.challenges;

import java.lang.Double;

public class Glassdoor_Challenge {

	public final static double AVERAGE_RADIUS_OF_EARTH = 6373;

	public static void main(String args[]){
		
		Glassdoor_Challenge gc = new Glassdoor_Challenge();
		int distance = gc.calcDistance(37.7768016, -122.4169151, 37.7821494, -122.4058960);
		System.out.println(distance);


	}
	public int calculateDistance(double userLat, double userLng, double venueLat, double venueLng) {

		double latDistance = Math.toRadians(userLat - venueLat);
		double lngDistance = Math.toRadians(userLng - venueLng);

		double a = (Math.sin(latDistance / 2) * Math.sin(latDistance / 2)) +
				(Math.cos(Math.toRadians(userLat))) *
				(Math.cos(Math.toRadians(venueLat))) *
				(Math.sin(lngDistance / 2)) *
				(Math.sin(lngDistance / 2));

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		return (int) (AVERAGE_RADIUS_OF_EARTH * c);

	}
	
	public int calcDistance(double Lat1, double Lng1, double Lat2, double Lng2) {

		double Lat = (Lat2 - Lat1);
		double Lng = (Lng2 - Lng1);
		
		double f1 = Math.sin(Lat/2);
		double f2 = f1 * f1;
		
		double x1 = Math.cos(Lat1);
		
		double y1 = Math.cos(Lat2);
		
		double z1 = Math.sin(Lng/2);
		double z2 = z1 * z1;
		

		Double a =  f2 + x1 * y1 * z1 ;

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

		return (int) (AVERAGE_RADIUS_OF_EARTH * c);

	}
	
	
}
