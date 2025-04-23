package iuh.fit.se.orderservice.service;



import iuh.fit.se.orderservice.model.Order;



public interface OrderService {
  public Order createOrder(Order order);
  public Order getOrderById(Long id);
}