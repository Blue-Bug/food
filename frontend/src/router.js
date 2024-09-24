
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerOrderManager from "./components/listers/CustomerOrderCards"
import CustomerOrderDetail from "./components/listers/CustomerOrderDetail"

import RiderDeliveryManager from "./components/listers/RiderDeliveryCards"
import RiderDeliveryDetail from "./components/listers/RiderDeliveryDetail"

import StoreCookManager from "./components/listers/StoreCookCards"
import StoreCookDetail from "./components/listers/StoreCookDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customers/orders',
                name: 'CustomerOrderManager',
                component: CustomerOrderManager
            },
            {
                path: '/customers/orders/:id',
                name: 'CustomerOrderDetail',
                component: CustomerOrderDetail
            },

            {
                path: '/riders/deliveries',
                name: 'RiderDeliveryManager',
                component: RiderDeliveryManager
            },
            {
                path: '/riders/deliveries/:id',
                name: 'RiderDeliveryDetail',
                component: RiderDeliveryDetail
            },

            {
                path: '/stores/cooks',
                name: 'StoreCookManager',
                component: StoreCookManager
            },
            {
                path: '/stores/cooks/:id',
                name: 'StoreCookDetail',
                component: StoreCookDetail
            },



    ]
})
