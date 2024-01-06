 /*eslint-disable*/
import Vue from "vue";
import App from "./App.vue";
import vuetify from "./plugins/vuetify";
import Managing from "./components";
import router from './router';
Vue.config.productionTip = false;
require('./GlobalStyle.css');

const axios = require("axios").default;

// backend host url
axios.backend = null; //"http://localhost:8088";

// axios.backendUrl = new URL(axios.backend);
axios.fixUrl = function(original){

  if(!axios.backend && original.indexOf("/")==0) return original;

  var url = null;

  try{
    url = new URL(original);
  }catch(e){
    url = new URL(axios.backend + original);
  }

  if(!axios.backend) return url.pathname;

  url.hostname = axios.backendUrl.hostname;
  url.port = axios.backendUrl.port;

  return url.href;
}

const templateFiles = require.context("./components", true);
Vue.prototype.$ManagerLists = [];
templateFiles.keys().forEach(function(tempFiles) {
  if (!tempFiles.includes("Manager.vue") && tempFiles.includes("vue")) {
    Vue.prototype.$ManagerLists.push(
      tempFiles.replace("./", "").replace(".vue", "")
    );
  }
});
Vue.use(Managing);
const pluralCaseList = []

pluralCaseList.push( {plural: "demandCompanies/aiSolutionRequests", pascal: "DemandCompanyAiSolutionRequest"} )
pluralCaseList.push( {plural: "demandCompanies/consultingAndRequirementAnalyses", pascal: "DemandCompanyConsultingAndRequirementAnalysis"} )
pluralCaseList.push( {plural: "demandCompanies/solutionProvisionAndMaintenances", pascal: "DemandCompanySolutionProvisionAndMaintenance"} )
pluralCaseList.push( {plural: "demandCompanies/technicalSupports", pascal: "DemandCompanyTechnicalSupport"} )

pluralCaseList.push( {plural: "supplyCompanies/developedAndProvidedSolutions", pascal: "SupplyCompanyDevelopedAndProvidedSolution"} )
pluralCaseList.push( {plural: "supplyCompanies/customerRequirementAnalyses", pascal: "SupplyCompanyCustomerRequirementAnalysis"} )
pluralCaseList.push( {plural: "supplyCompanies/technologyUpdateAndMaintenances", pascal: "SupplyCompanyTechnologyUpdateAndMaintenance"} )
pluralCaseList.push( {plural: "supplyCompanies/technicalSupports", pascal: "SupplyCompanyTechnicalSupport"} )

pluralCaseList.push( {plural: "aiTechnologyProviders/providedAiTechnologies", pascal: "AiTechnologyProviderProvidedAiTechnology"} )

pluralCaseList.push( {plural: "advertisingAndMarketingPartners/marketingAndAdvertisingActivities", pascal: "AdvertisingAndMarketingPartnerMarketingAndAdvertisingActivities"} )

pluralCaseList.push( {plural: "cloudServiceProviders/providedCloudServices", pascal: "CloudServiceProviderProvidedCloudService"} )

pluralCaseList.push( {plural: "developerAndTechnicalExperts/solutionDevelopments", pascal: "DeveloperAndTechnicalExpertSolutionDevelopment"} )
pluralCaseList.push( {plural: "developerAndTechnicalExperts/technicalSupports", pascal: "DeveloperAndTechnicalExpertTechnicalSupport"} )

pluralCaseList.push( {plural: "marketingAndSalesExperts/marketingAndSalesActivities", pascal: "MarketingAndSalesExpertMarketingAndSalesActivities"} )


Vue.prototype.$ManagerLists.forEach(function(item, idx) {
  pluralCaseList.forEach(function(tmp) {
    if(item.toLowerCase() == tmp.pascal.toLowerCase()) {
      var obj = {
        name: item,
        plural: tmp.plural
      }
      Vue.prototype.$ManagerLists[idx] = obj
    }
  })
})

new Vue({
  vuetify,
  router,
  render: h => h(App)
}).$mount("#app");
