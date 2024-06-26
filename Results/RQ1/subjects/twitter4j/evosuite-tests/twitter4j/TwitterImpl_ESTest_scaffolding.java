/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Mar 20 16:08:22 GMT 2024
 */

package twitter4j;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TwitterImpl_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "twitter4j.TwitterImpl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @BeforeEach
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @AfterEach
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TwitterImpl_ESTest_scaffolding.class.getClassLoader() ,
      "twitter4j.api.PlacesGeoResources",
      "twitter4j.auth.OAuth2Support",
      "twitter4j.UserJSONImpl",
      "twitter4j.JSONImplFactory",
      "twitter4j.HttpResponseCode",
      "twitter4j.api.HelpResources$Language",
      "twitter4j.TwitterBaseImpl",
      "twitter4j.OEmbedRequest",
      "twitter4j.JSONException",
      "twitter4j.api.ListsResources",
      "twitter4j.auth.OAuth2Token",
      "twitter4j.Place",
      "twitter4j.SLF4JLogger",
      "twitter4j.OEmbedRequest$Align",
      "twitter4j.HttpClientConfiguration",
      "twitter4j.Twitter",
      "twitter4j.LoggerFactory",
      "twitter4j.GeoLocation",
      "twitter4j.auth.RequestToken",
      "twitter4j.Query$Unit",
      "twitter4j.Version",
      "twitter4j.TwitterAPIConfiguration",
      "twitter4j.Location",
      "twitter4j.api.SuggestedUsersResources",
      "twitter4j.SavedSearch",
      "twitter4j.QueryResult",
      "twitter4j.management.APIStatistics",
      "twitter4j.auth.OAuthToken",
      "twitter4j.TwitterImpl",
      "twitter4j.api.TimelinesResources",
      "twitter4j.PagableResponseList",
      "twitter4j.RateLimitStatusJSONImpl",
      "twitter4j.HttpParameter",
      "twitter4j.api.UsersResources",
      "twitter4j.HttpRequest",
      "twitter4j.management.APIStatisticsMBean",
      "twitter4j.api.DirectMessagesResources",
      "twitter4j.api.TweetsResources",
      "twitter4j.DirectMessage",
      "twitter4j.conf.PropertyConfiguration",
      "twitter4j.ResponseListImpl",
      "twitter4j.StdOutLoggerFactory",
      "twitter4j.StringUtil",
      "twitter4j.HttpResponseEvent",
      "twitter4j.EntitySupport",
      "twitter4j.auth.BasicAuthorization",
      "twitter4j.auth.AccessToken",
      "twitter4j.RateLimitStatus",
      "twitter4j.TwitterResponseImpl",
      "twitter4j.SLF4JLoggerFactory",
      "twitter4j.management.APIStatisticsOpenMBean",
      "twitter4j.management.InvocationStatisticsCalculator",
      "twitter4j.HttpResponseListener",
      "twitter4j.conf.ConfigurationFactory",
      "twitter4j.auth.OAuth2Authorization",
      "twitter4j.auth.OAuthSupport",
      "twitter4j.Logger",
      "twitter4j.Trends",
      "twitter4j.TwitterResponse",
      "twitter4j.JSONObject",
      "twitter4j.User",
      "twitter4j.StreamingGZIPInputStream",
      "twitter4j.HttpClientFactory",
      "twitter4j.Category",
      "twitter4j.AccountSettings",
      "twitter4j.api.SearchResource",
      "twitter4j.auth.AuthorizationConfiguration",
      "twitter4j.XAuthAuthorization",
      "twitter4j.Friendship",
      "twitter4j.auth.OAuthAuthorization",
      "twitter4j.auth.NullAuthorization",
      "twitter4j.UserList",
      "twitter4j.api.TrendsResources",
      "twitter4j.UploadedMedia",
      "twitter4j.Status",
      "twitter4j.api.SpamReportingResource",
      "twitter4j.Paging",
      "twitter4j.HttpClientBase",
      "twitter4j.api.FavoritesResources",
      "twitter4j.IDs",
      "twitter4j.api.HelpResources",
      "twitter4j.Relationship",
      "twitter4j.HttpResponse",
      "twitter4j.auth.Authorization",
      "twitter4j.conf.ConfigurationBase$MyHttpClientConfiguration",
      "twitter4j.Query$ResultType",
      "twitter4j.RequestMethod",
      "twitter4j.OEmbed",
      "twitter4j.HttpResponseImpl",
      "twitter4j.conf.ConfigurationBase",
      "twitter4j.ParseUtil",
      "twitter4j.HttpClientImpl$1",
      "twitter4j.HashtagEntity",
      "twitter4j.JSONArray",
      "twitter4j.UserMentionEntity",
      "twitter4j.HttpClient",
      "twitter4j.BASE64Encoder",
      "twitter4j.ObjectFactory",
      "twitter4j.RateLimitStatusListener",
      "twitter4j.TwitterException",
      "twitter4j.GeoQuery",
      "twitter4j.ResponseList",
      "twitter4j.api.SavedSearchesResources",
      "twitter4j.util.function.Consumer",
      "twitter4j.TweetEntity",
      "twitter4j.AccountTotals",
      "twitter4j.conf.ConfigurationContext",
      "twitter4j.TwitterBase",
      "twitter4j.CursorSupport",
      "twitter4j.HttpClientImpl",
      "twitter4j.TwitterAPIMonitor",
      "twitter4j.Query",
      "twitter4j.JSONTokener",
      "twitter4j.api.FriendsFollowersResources",
      "twitter4j.URLEntity",
      "twitter4j.management.InvocationStatistics",
      "twitter4j.conf.PropertyConfigurationFactory",
      "twitter4j.conf.Configuration",
      "twitter4j.StatusUpdate",
      "twitter4j.JSONObject$Null"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TwitterImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "twitter4j.TwitterBaseImpl",
      "twitter4j.TwitterImpl",
      "twitter4j.Paging",
      "twitter4j.conf.ConfigurationBase",
      "twitter4j.conf.PropertyConfiguration",
      "twitter4j.conf.ConfigurationBase$MyHttpClientConfiguration",
      "twitter4j.conf.PropertyConfigurationFactory",
      "twitter4j.conf.ConfigurationContext",
      "twitter4j.LoggerFactory",
      "twitter4j.SLF4JLoggerFactory",
      "twitter4j.SLF4JLogger",
      "twitter4j.Logger",
      "twitter4j.management.APIStatistics",
      "twitter4j.management.InvocationStatisticsCalculator",
      "twitter4j.management.APIStatisticsOpenMBean",
      "twitter4j.TwitterAPIMonitor",
      "twitter4j.auth.BasicAuthorization",
      "twitter4j.BASE64Encoder",
      "twitter4j.HttpClientBase",
      "twitter4j.HttpClientImpl",
      "twitter4j.HttpClientFactory",
      "twitter4j.Version",
      "twitter4j.JSONImplFactory",
      "twitter4j.HttpParameter",
      "twitter4j.HttpRequest",
      "twitter4j.TwitterException",
      "twitter4j.HttpResponseEvent",
      "twitter4j.auth.OAuthAuthorization",
      "twitter4j.auth.OAuth2Authorization",
      "twitter4j.auth.NullAuthorization",
      "twitter4j.TwitterResponseImpl",
      "twitter4j.UserJSONImpl",
      "twitter4j.StringUtil",
      "twitter4j.HttpResponse",
      "twitter4j.HttpResponseImpl",
      "twitter4j.StatusUpdate",
      "twitter4j.JSONObject$Null",
      "twitter4j.JSONObject",
      "twitter4j.auth.OAuthToken",
      "twitter4j.auth.RequestToken",
      "twitter4j.UploadedMedia",
      "twitter4j.PlaceJSONImpl",
      "twitter4j.auth.OAuth2Token",
      "twitter4j.TwitterBaseImpl$1",
      "twitter4j.auth.AuthorizationFactory",
      "twitter4j.ParseUtil",
      "twitter4j.HTMLEntity",
      "twitter4j.JSONTokener",
      "twitter4j.auth.AccessToken",
      "twitter4j.RateLimitStatusJSONImpl",
      "twitter4j.JSONException",
      "twitter4j.StatusJSONImpl",
      "twitter4j.Query$Unit",
      "twitter4j.Query$ResultType",
      "twitter4j.Query",
      "twitter4j.GeoLocation",
      "twitter4j.TwitterBaseImpl$2",
      "twitter4j.GeoQuery",
      "twitter4j.JSONArray",
      "twitter4j.OEmbedRequest",
      "twitter4j.RequestMethod",
      "twitter4j.OEmbedRequest$Align",
      "twitter4j.ResponseListImpl"
    );
  }
}
