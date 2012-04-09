/*
 * Copyright (c) 2010 Tonic Solutions LLC.
 *
 * http://www.nimbits.com
 *
 *
 * Licensed under the GNU GENERAL PUBLIC LICENSE, Version 3.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the license is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, eitherexpress or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.client.service.subscription;

import com.google.gwt.user.client.rpc.*;
import com.nimbits.client.exception.*;
import com.nimbits.client.model.entity.*;
import com.nimbits.client.model.point.*;
import com.nimbits.client.model.subscription.*;
import com.nimbits.client.model.user.*;
import com.nimbits.client.model.value.*;

import java.util.*;

/**
 * Created by Benjamin Sautner
 * User: bsautner
 * Date: 2/15/12
 * Time: 3:52 PM
 */
@RemoteServiceRelativePath("subscribe")
public interface SubscriptionService  extends RemoteService {
    void processSubscriptions(final User u, final Point point, final Value v) throws NimbitsException;
    List<Subscription> getSubscriptionsToPoint(Entity point);
    void updateSubscriptionLastSent(Subscription subscription);
    Entity subscribe(Entity entity, Subscription subscription, EntityName name) throws NimbitsException;
    Subscription readSubscription(final Entity point) throws NimbitsException;
    Entity getSubscribedEntity(final Entity entity) throws NimbitsException;

    void deleteSubscription(User u, Entity entity);
}
