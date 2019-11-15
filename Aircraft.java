/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Aircraft.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: bogoncha <bogoncha@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/11/15 13:50:52 by bogoncha          #+#    #+#             */
/*   Updated: 2019/11/15 15:10:03 by bogoncha         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

abstract public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {
        nextId();
        this.name = name;
        this.coordinates = coordinates;
        this.id = idCounter;
    }

    private static long nextId(){
        idCounter += 1;
        return idCounter;
    }

//    public abstract Product factoryMethod();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public static long getIdCounter() {
        return idCounter;
    }
}

public main(String[] args) {
    Aircraft boeng = new Aircraft("777", 10,10,10);
    boeng.getName();
}