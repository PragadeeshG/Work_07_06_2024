create table if not exists override_reason_codes_reporting(
collateral_id Integer not null,
override_reason_codes_id Integer null,
ledger_account_number Integer null,
target_group varchar(255) null,
base_reporting_indicator Integer null,
override_reason_codes_mapped_to_report char null,
is_active char null,
legal_control_name varchar(255) null,
legal_control_type varchar(255) null,
creation_cr varchar(255) null,
modified_cr varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint override_reason_codes_reporting_pk primary key(collateral_id));