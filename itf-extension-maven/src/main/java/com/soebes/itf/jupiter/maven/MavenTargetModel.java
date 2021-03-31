package com.soebes.itf.jupiter.maven;

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

import org.apache.maven.model.Model;
import org.apiguardian.api.API;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

/**
 * This class represents the target {@code model}.
 *
 * <pre>
 * target/maven-it/
 *   .../FirstIT
 *        +--- test_case_one
 *                +--- .m2/
 *                +--- project
 *                        +--- src/
 *                        +--- pom.xml  <-- model
 *                +--- mvn-stdout.log
 *                +--- mvn-stderr.log
 * </pre>
 *
 * @author Karl Heinz Marbaise
 */
@API(status = EXPERIMENTAL, since = "0.10.0")
public final class MavenTargetModel {
  private final Model model;

  public MavenTargetModel(Model model) {
    this.model = model;
  }

  public Model model() {
    return model;
  }
}
