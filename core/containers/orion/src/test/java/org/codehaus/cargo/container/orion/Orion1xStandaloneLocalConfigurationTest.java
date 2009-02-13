/* 
 * ========================================================================
 * 
 * Copyright 2004-2006 Vincent Massol.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ========================================================================
 */
package org.codehaus.cargo.container.orion;

import org.codehaus.cargo.container.InstalledLocalContainer;
import org.codehaus.cargo.container.configuration.LocalConfiguration;
import org.codehaus.cargo.container.orion.Orion1xInstalledLocalContainer;
import org.codehaus.cargo.container.orion.internal.AbstractOrionStandaloneLocalConfigurationTest;

public class Orion1xStandaloneLocalConfigurationTest extends
    AbstractOrionStandaloneLocalConfigurationTest
{

    public InstalledLocalContainer createLocalContainer(LocalConfiguration configuration)
    {
        return new Orion1xInstalledLocalContainer(configuration);
    }

}