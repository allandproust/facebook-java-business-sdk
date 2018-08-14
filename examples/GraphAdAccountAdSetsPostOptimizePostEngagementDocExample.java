/**
 * Copyright (c) 2015-present, Facebook, Inc. All rights reserved.
 *
 * You are hereby granted a non-exclusive, worldwide, royalty-free license to
 * use, copy, modify, and distribute this software in source code or binary
 * form for use in connection with the web services and APIs provided by
 * Facebook.
 *
 * As with any software that integrates with the Facebook platform, your use
 * of this software is subject to the Facebook Developer Principles and
 * Policies [http://developers.facebook.com/policy/]. This copyright notice
 * shall be included in all copies or substantial portions of the software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

 import com.facebook.ads.sdk.*;
import java.io.File;
import java.util.Arrays;

public class GraphAdAccountAdSetsPostOptimizePostEngagementDocExample {
  public static void main (String args[]) throws APIException {

    String access_token = "<ACCESS_TOKEN>";
    String app_secret = "<APP_SECRET>";
    String app_id = "<APP_ID>";
    String id = "<ID>";
    APIContext context = new APIContext(access_token).enableDebug(true);

    new AdAccount(id, context).createAdSet()
      .setName("My First Adset")
      .setLifetimeBudget(20000L)
      .setStartTime("2018-08-09T18:06:15-0700")
      .setEndTime("2018-08-19T18:06:15-0700")
      .setCampaignId("<adCampaignLinkClicksID>")
      .setBidAmount(500L)
      .setBillingEvent(AdSet.EnumBillingEvent.VALUE_IMPRESSIONS)
      .setOptimizationGoal(AdSet.EnumOptimizationGoal.VALUE_POST_ENGAGEMENT)
      .setTargeting(
          new Targeting()
            .setFieldAgeMax(24L)
            .setFieldAgeMin(20L)
            .setFieldBehaviors(Arrays.asList(
              new IDName()
                .setFieldId(6002714895372L)
                .setFieldName("All travelers")
            ))
            .setFieldDevicePlatforms(Arrays.asList(Targeting.EnumDevicePlatforms.VALUE_DESKTOP))
            .setFieldGenders(Arrays.asList(1L))
            .setFieldGeoLocations(
              new TargetingGeoLocation()
                .setFieldCities(Arrays.asList(
                  new TargetingGeoLocationCity()
                    .setFieldDistanceUnit("mile")
                    .setFieldKey(777934L)
                    .setFieldRadius(10L)
                ))
                .setFieldCountries(Arrays.asList("US"))
                .setFieldRegions(Arrays.asList(
                  new TargetingGeoLocationRegion()
                    .setFieldKey("4081")
                ))
            )
            .setFieldHomeOwnership(Arrays.asList(
              new IDName()
                .setFieldId(6006371327132L)
                .setFieldName("Renters")
            ))
            .setFieldLifeEvents(Arrays.asList(
              new IDName()
                .setFieldId(6002714398172L)
                .setFieldName("Newlywed (1 year)")
            ))
            .setFieldPublisherPlatforms(Arrays.asList("facebook"))
        )
      .setStatus(AdSet.EnumStatus.VALUE_PAUSED)
      .execute();
  }
}