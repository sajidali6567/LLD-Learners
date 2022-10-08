package com.carrentalsystem.repository;

import com.carrentalsystem.model.Booking;
import com.carrentalsystem.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
  public static List<User> users = new ArrayList<>();

  public boolean addUser(User user) {
    users.add(user);
    return true;
  }

  public void addBookingToUser(User user, Booking booking) {

    for (User u : users) {
      if (u.getId() == user.getId()) {
        u.addBooking(booking);
      }
    }
  }
}
