/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Coordinates.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: bogoncha <bogoncha@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/11/15 14:17:13 by bogoncha          #+#    #+#             */
/*   Updated: 2019/11/15 14:57:24 by bogoncha         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

class Coordinates {
    private int longtitude;
    private int latitude;
    private int heigh;

    Coordinates(int longtitude, int latitudem, int heigh) {
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.heigh = heigh;
    }

    public int getLongtitude() {
        return longtitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return heigh;
    }

    //Setters
    public void setLongtitude(int lo) {
        this.longtitude = lo;
    }

    public void setLatitude(int la) {
        this.latitude = la;
    }

    public void setHeigh(int he) {
        this.heigh = he;
    }
}