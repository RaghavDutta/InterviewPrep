import { Component, OnInit } from '@angular/core';
import { ProductOrder } from '../models/product-order';
import { ProductOrders } from '../models/product-orders';
import { Subscription } from 'rxjs';

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

  constructor() { }

  ngOnInit(): void {
  }

}
