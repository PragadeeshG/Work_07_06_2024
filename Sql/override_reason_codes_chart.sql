create table if not exists override_reason_codes_chart(
collateral_id Integer not null,
override_reason_codes_id Integer null,
override_reason_codes_Indicator varchar(255) null,
override_reason_codes_sheet varchar(255) null,
override_reason_codes_control_flag varchar(255) null,
override_reason_codes_desc varchar(255) null,
override_reason_codes_short_desc varchar(255) null,
override_reason_codes_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint override_reason_codes_chart_pk primary key(collateral_id));