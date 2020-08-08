import { Component, OnInit } from '@angular/core';
import { ProductOrders } from '../models/product-orders';
import { Subscription } from 'rxjs';
import { EcommerceService } from '../services/ecommerce-service.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {
  orders: ProductOrders;
  total: number;
  paid: boolean;
  sub: Subscription;

  constructor(private ecommerceService: EcommerceService) { 
    this.orders = ecommerceService.ProductOrders;
  }

  ngOnInit() {
    this.paid = false;
    this.sub = this.ecommerceService.OrdersChanged.subscribe(() => 
    { this.orders = this.ecommerceService.ProductOrders;});
    this.loadTotal();
  }

  loadTotal() {
    this.sub = this.ecommerceService.TotalChanged.subscribe(() => {
      this.total = this.ecommerceService.Total;
  });
  }

  pay() {
    this.paid = true;
    this.ecommerceService.saveOrder(this.orders).subscribe();
  }
}
