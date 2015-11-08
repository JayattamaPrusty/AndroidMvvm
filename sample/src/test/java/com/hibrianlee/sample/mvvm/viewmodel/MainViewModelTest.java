/*
 * Copyright (C) 2015 Brian Lee (@hiBrianLee)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hibrianlee.sample.mvvm.viewmodel;

import com.hibrianlee.sample.mvvm.BaseTest;
import com.hibrianlee.sample.mvvm.activity.AndroidVersionsActivity;
import com.hibrianlee.sample.mvvm.activity.ClickCountActivity;

import org.junit.Test;

import static org.mockito.Mockito.verify;

public class MainViewModelTest extends BaseTest {

    private MainViewModel viewModel;

    @Override
    public void setup() {
        super.setup();
        viewModel = new MainViewModel(testComponent, null);
    }

    @Test
    public void testOnClickButtonClicks() {
        viewModel.onClickButtonClicks();
        verify(attachedActivity).startActivity(ClickCountActivity.class);
    }

    @Test
    public void testOnClickButtonRecyclerView() {
        viewModel.onClickButtonRecyclerView();
        verify(attachedActivity).startActivity(AndroidVersionsActivity.class);
    }

    @Test
    public void testOnClickHiBrianLee() throws Exception {
        // TODO
    }
}
