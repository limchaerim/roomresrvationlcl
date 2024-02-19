
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ScreenAccommodationManager from "./components/listers/ScreenAccommodationCards"
import ScreenAccommodationDetail from "./components/listers/ScreenAccommodationDetail"

import ReservationReservationManagementManager from "./components/listers/ReservationReservationManagementCards"
import ReservationReservationManagementDetail from "./components/listers/ReservationReservationManagementDetail"

import PaymentPaymentManager from "./components/listers/PaymentPaymentCards"
import PaymentPaymentDetail from "./components/listers/PaymentPaymentDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/screens/accommodations',
                name: 'ScreenAccommodationManager',
                component: ScreenAccommodationManager
            },
            {
                path: '/screens/accommodations/:id',
                name: 'ScreenAccommodationDetail',
                component: ScreenAccommodationDetail
            },

            {
                path: '/reservations/reservationManagements',
                name: 'ReservationReservationManagementManager',
                component: ReservationReservationManagementManager
            },
            {
                path: '/reservations/reservationManagements/:id',
                name: 'ReservationReservationManagementDetail',
                component: ReservationReservationManagementDetail
            },

            {
                path: '/payments/payments',
                name: 'PaymentPaymentManager',
                component: PaymentPaymentManager
            },
            {
                path: '/payments/payments/:id',
                name: 'PaymentPaymentDetail',
                component: PaymentPaymentDetail
            },



    ]
})
