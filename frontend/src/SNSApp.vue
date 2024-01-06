

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar color="primary" app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
		        ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-item
                        class="px-2"
                        key="aiSolutionRequests"
                        to="/demandCompanies/aiSolutionRequests"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        인공지능 솔루션 요청
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="consultingAndRequirementAnalyses"
                        to="/demandCompanies/consultingAndRequirementAnalyses"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        컨설팅 및 요구사항 분석
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="solutionProvisionAndMaintenances"
                        to="/demandCompanies/solutionProvisionAndMaintenances"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        솔루션 제공 및 유지보수
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="technicalSupports"
                        to="/demandCompanies/technicalSupports"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        기술 지원
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="developedAndProvidedSolutions"
                        to="/supplyCompanies/developedAndProvidedSolutions"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        개발 및 제공된 솔루션
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="customerRequirementAnalyses"
                        to="/supplyCompanies/customerRequirementAnalyses"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        고객 요구사항 분석
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="technologyUpdateAndMaintenances"
                        to="/supplyCompanies/technologyUpdateAndMaintenances"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        기술 업데이트 및 유지보수
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="technicalSupports"
                        to="/supplyCompanies/technicalSupports"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        기술 지원
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="providedAiTechnologies"
                        to="/aiTechnologyProviders/providedAiTechnologies"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        제공된 AI 기술
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="marketingAndAdvertisingActivities"
                        to="/advertisingAndMarketingPartners/marketingAndAdvertisingActivities"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        마케팅 및 광고 활동
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="providedCloudServices"
                        to="/cloudServiceProviders/providedCloudServices"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        클라우드 서비스 제공
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="solutionDevelopments"
                        to="/developerAndTechnicalExperts/solutionDevelopments"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        솔루션 개발
                    </v-list-item>

                    <v-list-item
                        class="px-2"
                        key="technicalSupports"
                        to="/developerAndTechnicalExperts/technicalSupports"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        기술 지원
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="marketingAndSalesActivities"
                        to="/marketingAndSalesExperts/marketingAndSalesActivities"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        마케팅 및 판매 활동
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container style="padding:0px;" v-if="urlPath" fluid>
                <router-view></router-view>
            </v-container>
            <v-container style="padding:0px;" v-else fluid>
                <div style="width:100%; margin:0px 0px 20px 0px; position: relative;">
                    <v-img style="width:100%; height:300px;"
                        src=""
                    ></v-img>
                    <div class="App-main-text-overlap"></div>
                    <div class="App-sub-text-overlap"></div>
                </div>
                <v-row>
                    <v-col cols="4" class="d-flex justify-center" v-for="(aggregate, index) in aggregate" :key="index">
                        <div 
                            class="flip-card"
                            @mouseover="flipCard(index)"
                            @mouseleave="unflipCard(index)"
                            :class="{ 'is-flipped': flipped[index] }"
                        >
                            <div class="flip-card-inner">
                                <div class="flip-card-front">
                                    <v-card
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <div style="text-align: left; padding:10px 15px 15px 15px; margin-top:-10px;">
                                            <h2>{{ aggregate.title }}</h2>
                                            <div>{{ aggregate.description }}</div>
                                        </div>
                                    </v-card>
                                </div>
                                <div class="flip-card-back">
                                    <v-card
                                        color="primary"
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                        :key="aggregate.key"
                                        :to="aggregate.route"
                                        @click="changeUrl()"
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <h2 style="color:white;">{{ aggregate.title }} 관리</h2>
                                    </v-card>
                                </div>
                            </div>
                        </div>
                    </v-col>
                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",
    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
        flipped: [],
        ImageUrl: '',
        aggregate: [
            { 
                title: '인공지능 솔루션 요청', 
                description: '수요기업은 트러스트 커넥터로부터 인공지능 솔루션의 필요성을 신청한다.', 
                key: 'aiSolutionRequests', 
                route: '/demandCompanies/aiSolutionRequests',
                ImageUrl: '',
            },
            { 
                title: '컨설팅 및 요구사항 분석', 
                description: '수요기업은 트러스트 커넥터의 컨설팅 및 요구사항 분석 서비스를 받는다.', 
                key: 'consultingAndRequirementAnalyses', 
                route: '/demandCompanies/consultingAndRequirementAnalyses',
                ImageUrl: '',
            },
            { 
                title: '솔루션 제공 및 유지보수', 
                description: '트러스트 커넥터는 수요기업에게 인공지능 솔루션을 제공하고 유지보수 서비스를 제공한다.', 
                key: 'solutionProvisionAndMaintenances', 
                route: '/demandCompanies/solutionProvisionAndMaintenances',
                ImageUrl: '',
            },
            { 
                title: '기술 지원', 
                description: '트러스트 커넥터는 수요기업에게 기술 지원을 제공하여 문제를 해결하고 지원한다.', 
                key: 'technicalSupports', 
                route: '/demandCompanies/technicalSupports',
                ImageUrl: '',
            },
            { 
                title: '개발 및 제공된 솔루션', 
                description: '공급기업은 트러스트 커넥터의 솔루션 개발 요청에 따라 인공지능 솔루션을 개발하고 제공한다.', 
                key: 'developedAndProvidedSolutions', 
                route: '/supplyCompanies/developedAndProvidedSolutions',
                ImageUrl: '',
            },
            { 
                title: '고객 요구사항 분석', 
                description: '공급기업은 트러스트 커넥터로부터 받은 수요기업의 요구사항을 분석하여 솔루션을 개발한다.', 
                key: 'customerRequirementAnalyses', 
                route: '/supplyCompanies/customerRequirementAnalyses',
                ImageUrl: '',
            },
            { 
                title: '기술 업데이트 및 유지보수', 
                description: '공급기업은 개발된 솔루션의 기술 업데이트와 유지보수를 제공한다.', 
                key: 'technologyUpdateAndMaintenances', 
                route: '/supplyCompanies/technologyUpdateAndMaintenances',
                ImageUrl: '',
            },
            { 
                title: '기술 지원', 
                description: '트러스트 커넥터가 공급기업에게 요청한 기술 지원을 제공한다.', 
                key: 'technicalSupports', 
                route: '/supplyCompanies/technicalSupports',
                ImageUrl: '',
            },
            { 
                title: '제공된 AI 기술', 
                description: 'AI 기술 제공업체는 트러스트 커넥터에게 AI 기술 및 알고리즘에 대한 구체적인 정보를 제공한다.', 
                key: 'providedAiTechnologies', 
                route: '/aiTechnologyProviders/providedAiTechnologies',
                ImageUrl: '',
            },
            { 
                title: '마케팅 및 광고 활동', 
                description: '광고 및 마케팅 파트너는 트러스트 커넥터의 솔루션을 홍보하고 광고하는 활동을 수행한다.', 
                key: 'marketingAndAdvertisingActivities', 
                route: '/advertisingAndMarketingPartners/marketingAndAdvertisingActivities',
                ImageUrl: '',
            },
            { 
                title: '클라우드 서비스 제공', 
                description: '클라우드 서비스 제공업체는 트러스트 커넥터에게 클라우드 서비스를 제공한다.', 
                key: 'providedCloudServices', 
                route: '/cloudServiceProviders/providedCloudServices',
                ImageUrl: '',
            },
            { 
                title: '솔루션 개발', 
                description: '개발자 및 기술 전문가는 트러스트 커넥터의 솔루션 개발을 수행한다.', 
                key: 'solutionDevelopments', 
                route: '/developerAndTechnicalExperts/solutionDevelopments',
                ImageUrl: '',
            },
            { 
                title: '기술 지원', 
                description: '개발자 및 기술 전문가는 트러스트 커넥터와 수요기업에게 기술 지원을 제공한다.', 
                key: 'technicalSupports', 
                route: '/developerAndTechnicalExperts/technicalSupports',
                ImageUrl: '',
            },
            { 
                title: '마케팅 및 판매 활동', 
                description: '마케팅 및 판매 전문가는 트러스트 커넥터의 솔루션을 마케팅하고 판매하는 활동을 수행한다.', 
                key: 'marketingAndSalesActivities', 
                route: '/marketingAndSalesExperts/marketingAndSalesActivities',
                ImageUrl: '',
            },
            
        ],
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },
    watch: {
        cards(newCards) {
            this.flipped = new Array(newCards.length).fill(false);
        },
    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
            this.flipped.fill(false);
        },
        goHome() {
            this.urlPath = null;
        },
        flipCard(index) {
            this.$set(this.flipped, index, true);
        },
        unflipCard(index) {
            this.$set(this.flipped, index, false);
        },
    }
};
</script>
<style>
</style>
