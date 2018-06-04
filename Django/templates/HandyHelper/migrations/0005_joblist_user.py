# -*- coding: utf-8 -*-
# Generated by Django 1.10 on 2018-05-30 19:38
from __future__ import unicode_literals

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('HandyHelper', '0004_remove_joblist_user'),
    ]

    operations = [
        migrations.AddField(
            model_name='joblist',
            name='user',
            field=models.ForeignKey(default=1, on_delete=django.db.models.deletion.CASCADE, related_name='myJobs', to='HandyHelper.User'),
            preserve_default=False,
        ),
    ]