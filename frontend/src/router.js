
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserUserManager from "./components/listers/UserUserCards"
import UserUserDetail from "./components/listers/UserUserDetail"

import ReportReportManager from "./components/listers/ReportReportCards"
import ReportReportDetail from "./components/listers/ReportReportDetail"

import CustomerCenterCustomerCenterManager from "./components/listers/CustomerCenterCustomerCenterCards"
import CustomerCenterCustomerCenterDetail from "./components/listers/CustomerCenterCustomerCenterDetail"

import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import PhonePhoneManager from "./components/listers/PhonePhoneCards"
import PhonePhoneDetail from "./components/listers/PhonePhoneDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/users/users',
                name: 'UserUserManager',
                component: UserUserManager
            },
            {
                path: '/users/users/:id',
                name: 'UserUserDetail',
                component: UserUserDetail
            },

            {
                path: '/reports/reports',
                name: 'ReportReportManager',
                component: ReportReportManager
            },
            {
                path: '/reports/reports/:id',
                name: 'ReportReportDetail',
                component: ReportReportDetail
            },

            {
                path: '/customerCenters/customerCenters',
                name: 'CustomerCenterCustomerCenterManager',
                component: CustomerCenterCustomerCenterManager
            },
            {
                path: '/customerCenters/customerCenters/:id',
                name: 'CustomerCenterCustomerCenterDetail',
                component: CustomerCenterCustomerCenterDetail
            },

            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },

            {
                path: '/phones/phones',
                name: 'PhonePhoneManager',
                component: PhonePhoneManager
            },
            {
                path: '/phones/phones/:id',
                name: 'PhonePhoneDetail',
                component: PhonePhoneDetail
            },




    ]
})
