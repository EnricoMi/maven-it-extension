package com.soebes.itf.jupiter.extension;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for the {@link MavenProjectSources} annotation.
 *
 * <p>This test is intended to check the default value which has been defined
 * within the annotation that they won't be changed unintentionally.</p>
 *
 * @author Karl Heinz Marbaise
 */
class MavenProjectSourcesTest {

  private MavenProjectSources mavenProjectSources;

  @BeforeEach
  void beforeEach() {
    this.mavenProjectSources = Helper.createAnnotation(this.getClass(), MavenProjectSources.class);
  }

  @Test
  void the_default_value_for_sources() {
    assertThat(mavenProjectSources.sources()).isEmpty();
  }

  @Test
  void the_default_value_for_resources_usage() {
    assertThat(mavenProjectSources.resourcesUsage()).isEqualTo(ResourceUsage.DEFAULT);
  }

}
