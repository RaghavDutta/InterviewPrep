import { Injectable } from '@angular/core';
import { ProductOrder } from '../models/product-order';
import { ProductOrders } from '../models/product-orders';
import { HttpClient} from '@angular/common/http';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EcommerceServiceService {
  private productsUrl="/api/products";
  private ordersUrl="/api/orders";

  private productOrder: ProductOrder;
  private orders: ProductOrders = new ProductOrders();

  private productOrderSubject = new Subject();
  private ordersSubject = new Subject();
  private totalSubject = new Subject();

  private total: number;
  ProductOrderChanged = this.productOrderSubject.asObservable;
  OrdersChanged = this.ordersSubject.asObservable;
  TotalChanged = this.totalSubject.asObservable;

  constructor(private http: HttpClient) { 
  }

  getAllProducts() {
    return this.http.get(this.productsUrl);
  }

  saveOrder(order: ProductOrders) {
    return this.http.post(this.ordersUrl, order);
  }

  setSelectedOrder(value: ProductOrder){
    this.productOrder=value;
    this.productOrderSubject.next();
  }

  getSelectedOrder() {
    return this.productOrder;
  }

  setProductOrder(value: ProductOrders) {
    this.orders = value;
    this.ordersSubject.next();
  }

  
}
