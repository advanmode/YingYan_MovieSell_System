import Vue from 'vue'
import VueRouter from 'vue-router'
import { Message } from 'element-ui'
import Login from "../views/Login";
import Welcome from "../views/Welcome";
import Register from "../views/Register";
import Error404 from "../views/Error404";
import Home from "../views/home/Home";
import Movie from "../views/movie/Movie";
import Cinema from "../views/cinema/Cinema";
import RankingList from "../views/rankinglist/Rankinglist";
import ReputationList from "@/views/rankinglist/ReputationList";
import DomesticBoxOfficeList from "@/views/rankinglist/DomesticBoxOfficeList";
import AmericanBoxOfficeList from "@/views/rankinglist/AmericanBoxOfficeList";
import Top100List from "@/views/rankinglist/Top100List";
import MovieOngoing from "../views/movie/MovieOngoing";
import MovieUpcoming from "../views/movie/MovieUpcoming";
import MovieClassics from "../views/movie/MovieClassics";
import MovieInfo from "../views/movie/MovieInfo";
import ActorInfo from "../views/actor/ActorInfo";
import CinemaInfo from "../views/cinema/CinemaInfo";
import ChooseSeat from "../views/pay/ChooseSeat";
import BillDetail from "../views/pay/BillDetail";
import Search from "../views/search/Search";
import SearchMovie from "../views/search/SearchMovie";
import SearchActor from "../views/search/SearchActor";
import SearchCinema from "../views/search/SearchCinema";
import UserMenu from "../views/user/UserMenu";
import UserInfo from "../views/user/UserInfo";
import BillInfo from "../views/user/BillInfo";

Vue.use(VueRouter)

const routes = [{
        path: '/',
        redirect: 'login'
    },
    {
        path: '/login',
        component: Login
    },
    {
        path: '/welcome',
        component: Welcome,
        redirect: { name: 'home' },
        children: [
            { path: '/home/', name: 'home', component: Home },
            {
                path: '/userMenu',
                name: 'userMenu',
                component: UserMenu,
                redirect: { name: 'userInfo' },
                children: [
                    { path: '/user', component: UserInfo, name: 'userInfo' },
                    { path: '/bill', component: BillInfo, name: 'billInfo' }
                ]
            },
            {
                path: '/movie/',
                component: Movie,
                name: 'movie',
                redirect: { name: '????????????' },
                children: [
                    { path: 'movieOngoing', name: '????????????', component: MovieOngoing },
                    { path: 'movieUpcoming', name: '????????????', component: MovieUpcoming },
                    { path: 'movieClassics', name: '????????????', component: MovieClassics }
                ]
            },
            {
                path: '/movieInfo/:movieId',
                name: '??????????????????',
                component: MovieInfo
            },
            {
                path: '/actor/:actorId',
                name: '??????????????????',
                component: ActorInfo
            },
            {
                path: '/cinema/',
                component: Cinema,
                name: 'cinema'
            },
            {
                path: '/cinemaInfo/:cinemaId',
                name: '??????????????????',
                component: CinemaInfo
            },
            {
                path: '/rankingList/',
                component: RankingList,
                name: 'rankingList',
                redirect: '/rankingList/reputationList',
                children: [
                    { path: 'reputationList', name: '???????????????', component: ReputationList },
                    { path: 'domesticBoxOfficeList', name: '???????????????', component: DomesticBoxOfficeList },
                    { path: 'americanBoxOfficeList', name: '???????????????', component: AmericanBoxOfficeList },
                    { path: 'top100List', name: 'Top100???', component: Top100List }
                ]
            },
            {
                path: '/ChooseSeat/:sessionId',
                component: ChooseSeat,
                name: 'chooseSeat',
            },
            {
                path: '/billDetail/:billId',
                component: BillDetail,
                name: 'billDetail'
            },
            {
                path: '/search/',
                component: Search,
                name: 'search',
                redirect: { name: 'searchMovie' },
                children: [{
                        path: 'searchMovie',
                        component: SearchMovie,
                        name: 'searchMovie',
                    },
                    {
                        path: 'searchActor',
                        component: SearchActor,
                        name: 'searchActor'
                    },
                    {
                        path: 'searchCinema',
                        component: SearchCinema,
                        name: 'searchCinema'
                    }
                ]
            }
        ]
    },
    {
        path: '/register',
        component: Register
    }, {
        path: '/*',
        component: Error404
    }
]

const router = new VueRouter({
    mode: 'history',
    routes
})


//????????????????????????
router.beforeEach((to, from, next) => {
    //to ?????????????????????
    //from ??????????????????
    //next ??????????????????

    if (to.path == '/login' || to.path == '/404' || to.path == '/register') return next();

    //??????token
    const token = window.sessionStorage.getItem("token")
    if (!token) {
        Message.error('?????????????????????')
        return next('/login');
    }
    next();
})

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
    return originalPush.call(this, location).catch(err => err)
}
export default router