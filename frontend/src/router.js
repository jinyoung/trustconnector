
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DemandCompanyAiSolutionRequestManager from "./components/listers/DemandCompanyAiSolutionRequestCards"
import DemandCompanyAiSolutionRequestDetail from "./components/listers/DemandCompanyAiSolutionRequestDetail"
import DemandCompanyConsultingAndRequirementAnalysisManager from "./components/listers/DemandCompanyConsultingAndRequirementAnalysisCards"
import DemandCompanyConsultingAndRequirementAnalysisDetail from "./components/listers/DemandCompanyConsultingAndRequirementAnalysisDetail"
import DemandCompanySolutionProvisionAndMaintenanceManager from "./components/listers/DemandCompanySolutionProvisionAndMaintenanceCards"
import DemandCompanySolutionProvisionAndMaintenanceDetail from "./components/listers/DemandCompanySolutionProvisionAndMaintenanceDetail"
import DemandCompanyTechnicalSupportManager from "./components/listers/DemandCompanyTechnicalSupportCards"
import DemandCompanyTechnicalSupportDetail from "./components/listers/DemandCompanyTechnicalSupportDetail"

import SupplyCompanyDevelopedAndProvidedSolutionManager from "./components/listers/SupplyCompanyDevelopedAndProvidedSolutionCards"
import SupplyCompanyDevelopedAndProvidedSolutionDetail from "./components/listers/SupplyCompanyDevelopedAndProvidedSolutionDetail"
import SupplyCompanyCustomerRequirementAnalysisManager from "./components/listers/SupplyCompanyCustomerRequirementAnalysisCards"
import SupplyCompanyCustomerRequirementAnalysisDetail from "./components/listers/SupplyCompanyCustomerRequirementAnalysisDetail"
import SupplyCompanyTechnologyUpdateAndMaintenanceManager from "./components/listers/SupplyCompanyTechnologyUpdateAndMaintenanceCards"
import SupplyCompanyTechnologyUpdateAndMaintenanceDetail from "./components/listers/SupplyCompanyTechnologyUpdateAndMaintenanceDetail"
import SupplyCompanyTechnicalSupportManager from "./components/listers/SupplyCompanyTechnicalSupportCards"
import SupplyCompanyTechnicalSupportDetail from "./components/listers/SupplyCompanyTechnicalSupportDetail"

import AiTechnologyProviderProvidedAiTechnologyManager from "./components/listers/AiTechnologyProviderProvidedAiTechnologyCards"
import AiTechnologyProviderProvidedAiTechnologyDetail from "./components/listers/AiTechnologyProviderProvidedAiTechnologyDetail"

import AdvertisingAndMarketingPartnerMarketingAndAdvertisingActivitiesManager from "./components/listers/AdvertisingAndMarketingPartnerMarketingAndAdvertisingActivitiesCards"
import AdvertisingAndMarketingPartnerMarketingAndAdvertisingActivitiesDetail from "./components/listers/AdvertisingAndMarketingPartnerMarketingAndAdvertisingActivitiesDetail"

import CloudServiceProviderProvidedCloudServiceManager from "./components/listers/CloudServiceProviderProvidedCloudServiceCards"
import CloudServiceProviderProvidedCloudServiceDetail from "./components/listers/CloudServiceProviderProvidedCloudServiceDetail"

import DeveloperAndTechnicalExpertSolutionDevelopmentManager from "./components/listers/DeveloperAndTechnicalExpertSolutionDevelopmentCards"
import DeveloperAndTechnicalExpertSolutionDevelopmentDetail from "./components/listers/DeveloperAndTechnicalExpertSolutionDevelopmentDetail"
import DeveloperAndTechnicalExpertTechnicalSupportManager from "./components/listers/DeveloperAndTechnicalExpertTechnicalSupportCards"
import DeveloperAndTechnicalExpertTechnicalSupportDetail from "./components/listers/DeveloperAndTechnicalExpertTechnicalSupportDetail"

import MarketingAndSalesExpertMarketingAndSalesActivitiesManager from "./components/listers/MarketingAndSalesExpertMarketingAndSalesActivitiesCards"
import MarketingAndSalesExpertMarketingAndSalesActivitiesDetail from "./components/listers/MarketingAndSalesExpertMarketingAndSalesActivitiesDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/demandCompanies/aiSolutionRequests',
                name: 'DemandCompanyAiSolutionRequestManager',
                component: DemandCompanyAiSolutionRequestManager
            },
            {
                path: '/demandCompanies/aiSolutionRequests/:id',
                name: 'DemandCompanyAiSolutionRequestDetail',
                component: DemandCompanyAiSolutionRequestDetail
            },
            {
                path: '/demandCompanies/consultingAndRequirementAnalyses',
                name: 'DemandCompanyConsultingAndRequirementAnalysisManager',
                component: DemandCompanyConsultingAndRequirementAnalysisManager
            },
            {
                path: '/demandCompanies/consultingAndRequirementAnalyses/:id',
                name: 'DemandCompanyConsultingAndRequirementAnalysisDetail',
                component: DemandCompanyConsultingAndRequirementAnalysisDetail
            },
            {
                path: '/demandCompanies/solutionProvisionAndMaintenances',
                name: 'DemandCompanySolutionProvisionAndMaintenanceManager',
                component: DemandCompanySolutionProvisionAndMaintenanceManager
            },
            {
                path: '/demandCompanies/solutionProvisionAndMaintenances/:id',
                name: 'DemandCompanySolutionProvisionAndMaintenanceDetail',
                component: DemandCompanySolutionProvisionAndMaintenanceDetail
            },
            {
                path: '/demandCompanies/technicalSupports',
                name: 'DemandCompanyTechnicalSupportManager',
                component: DemandCompanyTechnicalSupportManager
            },
            {
                path: '/demandCompanies/technicalSupports/:id',
                name: 'DemandCompanyTechnicalSupportDetail',
                component: DemandCompanyTechnicalSupportDetail
            },

            {
                path: '/supplyCompanies/developedAndProvidedSolutions',
                name: 'SupplyCompanyDevelopedAndProvidedSolutionManager',
                component: SupplyCompanyDevelopedAndProvidedSolutionManager
            },
            {
                path: '/supplyCompanies/developedAndProvidedSolutions/:id',
                name: 'SupplyCompanyDevelopedAndProvidedSolutionDetail',
                component: SupplyCompanyDevelopedAndProvidedSolutionDetail
            },
            {
                path: '/supplyCompanies/customerRequirementAnalyses',
                name: 'SupplyCompanyCustomerRequirementAnalysisManager',
                component: SupplyCompanyCustomerRequirementAnalysisManager
            },
            {
                path: '/supplyCompanies/customerRequirementAnalyses/:id',
                name: 'SupplyCompanyCustomerRequirementAnalysisDetail',
                component: SupplyCompanyCustomerRequirementAnalysisDetail
            },
            {
                path: '/supplyCompanies/technologyUpdateAndMaintenances',
                name: 'SupplyCompanyTechnologyUpdateAndMaintenanceManager',
                component: SupplyCompanyTechnologyUpdateAndMaintenanceManager
            },
            {
                path: '/supplyCompanies/technologyUpdateAndMaintenances/:id',
                name: 'SupplyCompanyTechnologyUpdateAndMaintenanceDetail',
                component: SupplyCompanyTechnologyUpdateAndMaintenanceDetail
            },
            {
                path: '/supplyCompanies/technicalSupports',
                name: 'SupplyCompanyTechnicalSupportManager',
                component: SupplyCompanyTechnicalSupportManager
            },
            {
                path: '/supplyCompanies/technicalSupports/:id',
                name: 'SupplyCompanyTechnicalSupportDetail',
                component: SupplyCompanyTechnicalSupportDetail
            },

            {
                path: '/aiTechnologyProviders/providedAiTechnologies',
                name: 'AiTechnologyProviderProvidedAiTechnologyManager',
                component: AiTechnologyProviderProvidedAiTechnologyManager
            },
            {
                path: '/aiTechnologyProviders/providedAiTechnologies/:id',
                name: 'AiTechnologyProviderProvidedAiTechnologyDetail',
                component: AiTechnologyProviderProvidedAiTechnologyDetail
            },

            {
                path: '/advertisingAndMarketingPartners/marketingAndAdvertisingActivities',
                name: 'AdvertisingAndMarketingPartnerMarketingAndAdvertisingActivitiesManager',
                component: AdvertisingAndMarketingPartnerMarketingAndAdvertisingActivitiesManager
            },
            {
                path: '/advertisingAndMarketingPartners/marketingAndAdvertisingActivities/:id',
                name: 'AdvertisingAndMarketingPartnerMarketingAndAdvertisingActivitiesDetail',
                component: AdvertisingAndMarketingPartnerMarketingAndAdvertisingActivitiesDetail
            },

            {
                path: '/cloudServiceProviders/providedCloudServices',
                name: 'CloudServiceProviderProvidedCloudServiceManager',
                component: CloudServiceProviderProvidedCloudServiceManager
            },
            {
                path: '/cloudServiceProviders/providedCloudServices/:id',
                name: 'CloudServiceProviderProvidedCloudServiceDetail',
                component: CloudServiceProviderProvidedCloudServiceDetail
            },

            {
                path: '/developerAndTechnicalExperts/solutionDevelopments',
                name: 'DeveloperAndTechnicalExpertSolutionDevelopmentManager',
                component: DeveloperAndTechnicalExpertSolutionDevelopmentManager
            },
            {
                path: '/developerAndTechnicalExperts/solutionDevelopments/:id',
                name: 'DeveloperAndTechnicalExpertSolutionDevelopmentDetail',
                component: DeveloperAndTechnicalExpertSolutionDevelopmentDetail
            },
            {
                path: '/developerAndTechnicalExperts/technicalSupports',
                name: 'DeveloperAndTechnicalExpertTechnicalSupportManager',
                component: DeveloperAndTechnicalExpertTechnicalSupportManager
            },
            {
                path: '/developerAndTechnicalExperts/technicalSupports/:id',
                name: 'DeveloperAndTechnicalExpertTechnicalSupportDetail',
                component: DeveloperAndTechnicalExpertTechnicalSupportDetail
            },

            {
                path: '/marketingAndSalesExperts/marketingAndSalesActivities',
                name: 'MarketingAndSalesExpertMarketingAndSalesActivitiesManager',
                component: MarketingAndSalesExpertMarketingAndSalesActivitiesManager
            },
            {
                path: '/marketingAndSalesExperts/marketingAndSalesActivities/:id',
                name: 'MarketingAndSalesExpertMarketingAndSalesActivitiesDetail',
                component: MarketingAndSalesExpertMarketingAndSalesActivitiesDetail
            },



    ]
})
